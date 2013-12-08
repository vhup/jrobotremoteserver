package org.robotframework.remoteserver.testlibraries;

public class DynamicOneRunKeywordNoKwargs extends StaticOne {

    public String[] getKeywordNames() {
        return new String[] {"getArgs"};
    }

    public Object runKeyword(String name, Object[] args) {
        if (name.equals("getArgs")) {
            System.out.println(getArgs(args));
            return getArgs(args);
        } else {
            throw new RuntimeException();
        }
    }

}
