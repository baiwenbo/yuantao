package cn.vo.dao.hans;

import cn.vo.pojo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerMapper extends JpaRepository<Customer, Integer> {
}
