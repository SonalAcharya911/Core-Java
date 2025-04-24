package com.xworkz.golden.runner;

import com.xworkz.golden.external.IplApp;
import com.xworkz.golden.external.MysqlJDBC;
import com.xworkz.golden.external.OracleJDBC;
import com.xworkz.golden.internal.JDBC;

public class JdbcRuner {
    public static void main(String[] args) {
        JDBC jdbc=new OracleJDBC();
        JDBC jdbc1=new MysqlJDBC();

        jdbc.save();
        jdbc1.save();

        System.out.println("=====================================");

        IplApp iplApp=new IplApp(jdbc);
        iplApp.saveTeamInfo();
    }
}
