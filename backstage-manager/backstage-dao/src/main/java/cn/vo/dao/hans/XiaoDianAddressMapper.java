package cn.vo.dao.hans;

import cn.vo.pojo.entity.HansXiaoDianAddress;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

/**
 * @author <a href="wenbo.bai@vtradex.net">柏文博</a>
 * @since 2019-01-18 14:04
 */
public interface XiaoDianAddressMapper extends JpaRepository<HansXiaoDianAddress, Long> {

    @Query(value="select  new cn.vo.pojo.entity.HansXiaoDianAddress(h.id,h.area,h.area,h.address,h.city,h.company,h.daqu,h.name,h.pianqu,h.province)  from HansXiaoDianAddress h where  h.disabled=0 limit  0,20", nativeQuery = true)
    List<HansXiaoDianAddress> queryMap(@Param("name") String name,@Param("index") Integer indexzero , @Param("pageSize") Integer pageSize);

}
