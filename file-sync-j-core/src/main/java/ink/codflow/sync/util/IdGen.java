package ink.codflow.sync.util;

import java.util.UUID;

public class IdGen {

    public static final String genUUID() {
        return UUID.randomUUID().toString();
    }
}
