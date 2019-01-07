    /*
     * 文件名: com.dundunmonster.springbootjpa.entity
     * 文件编号:
     * 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
     * 描述:
     * 创建人: ghaoxiang
     * 创建时间: 2019年01月07日 20:32
     * 修改人:
     * 修改时间: 2019年01月07日 20:32
     * 修改变更号:
     * 修改内容:
     */
    package com.dundunmonster.springbootjpa.entity;

    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.Id;

    /**
     * @author ghaoxiang
     * @version V1.0
     * @Title Account
     * @Description
     * @date 2019年01月07日 20:32
     * @since V1.0
     */
    @Entity
    public class Account {

        @Id
        @GeneratedValue
        private int id ;

        private String name ;

        private double money;

        public Account() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMoney() {
            return money;
        }

        public void setMoney(double money) {
            this.money = money;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", money=" + money +
                    '}';
        }
    }
