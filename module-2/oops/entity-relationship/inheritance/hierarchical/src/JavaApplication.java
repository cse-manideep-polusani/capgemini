class JavaApplication {
    public static void execution(){
        Oracle oracle = new Oracle();
        oracle.url="www.oracledb.com";
        oracle.username="Mani";
        oracle.password="Mani!111";
        oracle.displayOracleDbInfo();
        oracle.connection();
        oracle.crudOperation();
        oracle.disconnection();

        MySQL MySQL = new MySQL();
        MySQL.url="www.mySQLdb.com";
        MySQL.username="Rani";
        MySQL.password="Rani!111";
        MySQL.displayMySQLDbInfo();
        MySQL.connection();
        MySQL.crudOperation();
        MySQL.disconnection();
    }
}
