package Hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Javier Augusto Zambrano Macías
 * @author Samuel López Domínguez
 */
public class Hibernate 
{
    private static final SessionFactory sessionFactory;
    
    static 
    {
        try 
        {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } 
        catch (HibernateException ex) 
        {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() 
    {
        return sessionFactory;
    }
}
