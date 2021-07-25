package entity;

import java.io.Serializable;

/**
 * Author: 徐明皓
 * Date: 2021-07-25 14:33
 * Description: <描述>
 */
public class Dept implements Serializable {
    private Integer id;
    private String name;

    public Dept() {
    }

    public Dept(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
