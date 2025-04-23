package com.xworkz.external.impl;

import com.xworkz.internal.rule.Window;

public class RoomWindowImpl implements Window {
    @Override
    public void open() {
        System.out.println("running open in RoomWindowImpl");
    }

    @Override
    public void close() {
        System.out.println("running close in RoomWindowImpl");
    }

    @Override
    public void lock() {
        System.out.println("running lock in RoomWindowImpl");
    }

    @Override
    public void unlock() {
        System.out.println("running unlock in RoomWindowImpl");
    }

    @Override
    public void clean() {
        System.out.println("running clean in RoomWindowImpl");
    }

    @Override
    public void dontBreakGlass() {
        System.out.println("running dontBreakGlass in RoomWindowImpl");
    }

    @Override
    public void slide() {
        System.out.println("running slide in RoomWindowImpl");
    }
}
