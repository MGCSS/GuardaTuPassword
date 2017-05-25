package model;
// Generated 23-may-2017 12:37:57 by Hibernate Tools 4.3.1



/**
 * AccountId generated by hbm2java
 */
public class AccountId  implements java.io.Serializable {


     private long accountId;
     private String userId;

    public AccountId() {
    }

    public AccountId(long accountId, String userId) {
       this.accountId = accountId;
       this.userId = userId;
    }
   
    public long getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AccountId) ) return false;
		 AccountId castOther = ( AccountId ) other; 
         
		 return (this.getAccountId()==castOther.getAccountId())
 && ( (this.getUserId()==castOther.getUserId()) || ( this.getUserId()!=null && castOther.getUserId()!=null && this.getUserId().equals(castOther.getUserId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getAccountId();
         result = 37 * result + ( getUserId() == null ? 0 : this.getUserId().hashCode() );
         return result;
   }   


}

