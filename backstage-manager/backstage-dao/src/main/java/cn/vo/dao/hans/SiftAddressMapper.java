package cn.vo.dao.hans;

import cn.vo.pojo.entity.HansSiftAddress;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author <a href="wenbo.bai@vtradex.net">柏文博</a>
 * @since 2019-01-18 14:04
 */
public interface SiftAddressMapper extends JpaRepository<HansSiftAddress, Long> {

    @Query(value="select  *  from hans_sift_address h where  h.code=?1", nativeQuery = true)
    HansSiftAddress queryMap(@Param("code") String code);

}
