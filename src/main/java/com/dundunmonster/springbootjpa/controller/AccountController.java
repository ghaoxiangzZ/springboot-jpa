    /*
     * 文件名: com.dundunmonster.springbootjpa.controller
     * 文件编号:
     * 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
     * 描述:
     * 创建人: ghaoxiang
     * 创建时间: 2019年01月07日 20:48
     * 修改人:
     * 修改时间: 2019年01月07日 20:48
     * 修改变更号:
     * 修改内容:
     */
    package com.dundunmonster.springbootjpa.controller;

    import com.dundunmonster.springbootjpa.dao.AccountDao;
    import com.dundunmonster.springbootjpa.entity.Account;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    /**
     * @author ghaoxiang
     * @version V1.0
     * @Title AccountController
     * @Description
     * @date 2019年01月07日 20:48
     * @since V1.0
     */
    @RestController
    @RequestMapping("/account")
    public class AccountController {

        @Autowired
        AccountDao accountDao;

        @RequestMapping(value = "/list", method = RequestMethod.GET)
        public List<Account> getAccounts() {
            return accountDao.findAll();
        }

        @RequestMapping(value = "/{id}", method = RequestMethod.GET)
        public Account getAccountById(@PathVariable("id") int id) {
            return accountDao.findById(id).orElse(null);
        }

        @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
        public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                    @RequestParam(value = "money", required = true) double money) {
            Account account = new Account();
            account.setMoney(money);
            account.setName(name);
            account.setId(id);
            Account account1 = accountDao.saveAndFlush(account);

            return account1.toString();

        }

        @RequestMapping(value = "", method = RequestMethod.POST)
        public String postAccount(@RequestParam(value = "name") String name,
                                  @RequestParam(value = "money") double money) {
            Account account = new Account();
            account.setMoney(money);
            account.setName(name);
            Account account1 = accountDao.save(account);
            return account1.toString();

        }
    }
