package com.hoja;

public class SighIn {
    private static SighIn SighIn;
    public synchronized static SighIn
    getLogInstance(){
        if(SighIn==null)
        {
            SighIn=new SighIn ();
        }
        return SighIn;
    }
    SighIn(){}

    private String userName;
    private String pass;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
