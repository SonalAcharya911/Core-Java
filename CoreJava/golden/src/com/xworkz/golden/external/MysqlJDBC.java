package com.xworkz.golden.external;

import com.xworkz.golden.internal.JDBC;

public class MysqlJDBC implements JDBC {
    @Override
    public void save() {
        System.out.println("running save in MysqlJDBC");
    }
}
