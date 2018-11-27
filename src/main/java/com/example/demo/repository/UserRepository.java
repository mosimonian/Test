package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * {@link User} {@link Repository}
 */
//用户仓储
@Repository
public class UserRepository {
    /**
     * 采取内存行的存储方式
     */
    private final ConcurrentMap<Integer, User> repository = new ConcurrentHashMap<>();
    private  final  static AtomicInteger idGenerator = new AtomicInteger();
    /**
     * 保存用户对象
     * @param user {@link User} 对像
     * @return 保存成功,返回<code>true</code>
     *          保存失败,返回<code>false</code>
     */
    public boolean save(User user){
        //ID 从1开始
        Integer id = idGenerator.incrementAndGet();
        user.setId(id);
        return repository.put(id,user) == null;
    }

    /**
     * 查询所有用户
     * @return
     */
    public ConcurrentMap<Integer, User> getMap(){
        return repository;
    }

    /**
     * 根据id修改用户
     * @param id
     * @param name
     */
    public void update(int id, String name) {
        ConcurrentMap<Integer, User> map = this.getMap();
        Set<Map.Entry<Integer, User>> entries = map.entrySet();
        for (Map.Entry<Integer, User> entry: entries ) {
            if (entry.getKey() == id) {
                User user = entry.getValue();
                user.setName(name);
            }
        }
    }

    /**
     * 根据ID删除用户
     * @param id
     */
    public void delete(int id) {
        ConcurrentMap<Integer, User> map = this.getMap();
        Set<Map.Entry<Integer, User>> entries = map.entrySet();
        for (Map.Entry<Integer, User> entry: entries ) {
            if (entry.getKey() == id) {
                map.remove(id);
            }
        }
    }
}
