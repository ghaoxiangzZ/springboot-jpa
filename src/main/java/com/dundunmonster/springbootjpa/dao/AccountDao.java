    /*
     * 文件名: com.dundunmonster.springbootjpa.dao
     * 文件编号:
     * 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
     * 描述:
     * 创建人: ghaoxiang
     * 创建时间: 2019年01月07日 20:46
     * 修改人:
     * 修改时间: 2019年01月07日 20:46
     * 修改变更号:
     * 修改内容:
     */
    package com.dundunmonster.springbootjpa.dao;

    import com.dundunmonster.springbootjpa.entity.Account;
    import org.springframework.data.jpa.repository.JpaRepository;

    /**
     * @author ghaoxiang
     * @version V1.0
     * @Title AccountDao
     * @Description
     * @date 2019年01月07日 20:46
     * @since V1.0
     */
    public interface AccountDao extends JpaRepository<Account, Integer> {
    }
