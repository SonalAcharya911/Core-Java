package com.xworkz.golden.external;

import com.xworkz.golden.internal.JDBC;

public class OracleJDBC implements JDBC {
    @Override
    public void save() {
        System.out.println("running save in OracleJDBC");
    }
}
