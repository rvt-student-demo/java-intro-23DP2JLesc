package lv.rvt;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {
    private String name;
    private String creationTime;

    public Item(String name) {
        this.name = name;
        this.creationTime = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
    }

    @Override
    public String toString() {
        return this.name + " (created at: " + this.creationTime + ")";
    }
}