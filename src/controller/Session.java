package controller;

import Hibernate.Hibernate;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.AccountId;
import model.User;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 * Esta clase gestiona la sesión de un usuario.
 * This class manages a user session.
 * 
 * @author Javier Augusto Zambrano Macías
 * @author Samuel López Domínguez
 */
public class Session 
{
    // Cuentas del usuario que ha iniciado sesión.
    // User accounts.
    private List<Account> accounts;
    private org.hibernate.Session session;
    private Transaction tx;
    private User user;

    public Session() {}
    public Session(String dni, String password)
    {
        User user_;
        List<Account> accounts_;
        
        user_     = getUser(dni, password);
        accounts_ = getUserAccounts(dni);
        if(user_ != null)
        {
            this.user = user_;
        }
        else
            System.out.println("Usuario inexistente...");
        
        if(accounts_ != null)
        {
            this.accounts = accounts_;
        }
        else
        {
            System.out.println("Usuario sin cuentas...");
            this.accounts = new ArrayList<>();
        }   
    }
    
    /**
     * Esta función añade una nueva cuenta de un usuario a la BD.
     * This function adds a new user account to the DB.
     * 
     * @param account cuenta a añadir.
     * @return True si la cuenta se ha añadido a la BD. False en caso contrario.
     */
    private boolean addAccount(Account account)
    {
        boolean result;
        
        try
        {
            initOperation();
            ///genera ID (Long).
            //asocia la cuenta al usuario.
            account.setId(new AccountId(System.currentTimeMillis(), this.user.getId()));
            session.save(account);
            System.out.println("Cuenta creada correctamente...");
            accounts.add(account);
            result = true;
        }
        catch(HibernateException he)
        {
            result = false;
            handleException(he);
            throw he;
        }
        finally
        {
            finishOperation();
        }
        
        return result;
    }
    
    public boolean addAccount_(Account account)
    {
        return addAccount(account);
    }

    /**
     * Esta función elimina una cuenta de un usuario de la BD.
     * This function deletes an user account from the DB.
     * 
     * @param account cuenta a eliminar.
     * @return True si la cuenta se ha eliminado. False en caso contrario.
     */
    private boolean deleteAccount(Account account) 
    {
        boolean result;
        
        try
        {
            initOperation();
            //asocia al usuario
            account.getId().setUserId(this.user.getId());
            session.delete(account);
            System.out.println("Cuenta eliminada correctamente...");
            accounts.removeIf(c-> c.getId().getAccountId() == account.getId().getAccountId() && c.getId().getUserId().equals(account.getId().getUserId()));
            result = true;
        }
        catch(HibernateException he)
        {
            result = false;
            handleException(he);
            throw he;
        }
        finally
        {
            finishOperation();
        }
        return result;
    }

    public boolean deleteAccount_(Account account) 
    {
        return deleteAccount(account);
    }
    
    /**
     * Esta función comprueba si un usuario existe o no.
     * This function checks if an user exists or not.
     * 
     * @return True si el usuario existe. False en caso contrario.
     */
    public boolean existsUser()
    {
        return this.user != null;
    }
    
    /**
     * Finaliza una transacción.
     * Finishes a transaction.
     *
     * @throws HibernateException
     */
    private void finishOperation() throws HibernateException 
    {
        System.out.println("Finishing Hibernate...");
        tx.commit();
        session.close();
    }

    /**
     * Esta función obtiene un usuario de la BD.
     * This function retrieves an user from the DB.
     * 
     * @param dni DNI del usuario.
     * @param password contraseña del usuario.
     * @return Usuario recuperado de la BD. Null si el usuario no existe.
     */
    private User getUser(String dni, String password) 
    {
        Query getUsersQuery;
        List<User> usuarios;

        initOperation();
        getUsersQuery = session.createQuery("SELECT u FROM User u WHERE id=:userId and password=:pass");
        getUsersQuery.setParameter("userId", dni);
        getUsersQuery.setParameter("pass", password);
        usuarios = getUsersQuery.list();
        finishOperation();
        if(!usuarios.isEmpty())
            return usuarios.get(0);
        else return null;
    }
    
    /**
     * Esta función obtiene las cuentas de un usuario de la BD.
     * This function retrieves user accounts from the DB.
     * 
     * @param dni DNI del usuario.
     * @return Lista de todas las cuentas del usuario. Null si el usuario no tiene cuentas.
     */
    private List<Account> getUserAccounts(String dni)
    {
        Query getAccountsQuery;
        List<Account> accounts_;
        
        initOperation();
        getAccountsQuery = session.createQuery("SELECT C FROM Account C WHERE USER_ID=:Dni");
        getAccountsQuery.setParameter("Dni", dni);
        accounts_        = getAccountsQuery.list();
        finishOperation();
        if(!accounts_.isEmpty())
        {
            return accounts_;
        }
        else return null;     
    }
   
    /**
     * Esta función devuelve todas las cuentas de un usuario.
     * This function returns all user accounts.
     * 
     * @return Lista de todas las cuentas del usuario.
     */
    public List<Account> getUserAccounts()
    {
        return accounts;
    }

    /**
     * Maneja todas las excepciones producidas en el código.
     * Handles all the exceptions fired in the code.
     *
     * @param he HibernateException object.
     * @throws HibernateException
     */
    public void handleException(HibernateException he) throws HibernateException 
    {
        tx.rollback();
        System.out.println("An error occurred in the data access layer " + he.getMessage());
        System.exit(0);
    }

    /**
     * Inicia una transacción.
     * Starts a transaction.
     * 
     * @throws HibernateException 
     */
    private void initOperation() throws HibernateException 
    {
        System.out.println("Starting Hibernate...");
        session = Hibernate.getSessionFactory().openSession(); //iniciamos una sesión Hibernate
        tx = session.beginTransaction(); // comienza la transaccion
    }
    
    /**
     * Esta función guarda un usuario en la BD.
     * This function stores an user to the DB.
     * 
     * @param user usuario a guardar.
     * @return True si ha sido guardado correctamente. False en caso contrario.
     */
    private boolean storeUser(User user)
    {
        boolean result;
        
        try
        {
            initOperation();
            session.save(user);
            System.out.println("Usuario creado correctamente...");
            result = true;
        }
        catch(HibernateException he)
        {
            result = false;
            handleException(he);
            throw he;
        }
        finally
        {
            finishOperation();
        }
        return result;
    }

    public boolean storeUser_(User user)
    {
        return storeUser(user);
    }
    
    /**
     * Esta función actualiza la contraseña de acceso a la aplicación.
     * This function updates the app access password.
     * 
     * @return True si la contraseña ha sido actualizada correctamente. False en caso contrario.
     */
    private boolean updateAccessPassword()
    {
        boolean result;
        
        try
        {
            initOperation();
            session.update(this.user);
            System.out.println("Usuario actualizado correctamente...");
            result = true;
        }
        catch(HibernateException he)
        {
            result = false;
            handleException(he);
            throw he;
        }
        finally
        {
            finishOperation();
        }
        return result;
    }
    
    public boolean updateAccessPassword(String newPassword)
    {
        this.user.setPassword(newPassword);
        return updateAccessPassword();
    }

    /**
     * Esta función actualiza una cuenta de usuario.
     * This function updates an user account.
     * 
     * @param account cuenta a ser actualizada.
     * @return True si la cuenta se actualizó correctamente. False en caso contrario.
     */
    private boolean updateAccount(Account account)
    {
        boolean result;
        
        try
        {
            initOperation();
            account.getId().setUserId(this.user.getId());
            session.update(account);
            System.out.println("Cuenta actualizada correctamente...");
            result = true;
        }
        catch(HibernateException he)
        {
            result = false;
            handleException(he);
            throw he;
        }
        finally
        {
            finishOperation();
        }
        return result;        
    }

    public boolean updateAccount_(Account account)
    {
        return updateAccount(account);
    }

}
