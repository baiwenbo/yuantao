package cn.vo.pojo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author <a href="wenbo.bai@vtradex.net">柏文博</a>
 * @since 2019-01-18 11:01
 */


@Entity
@Table(name="test")
public class Test {
    @Id   // 表明id
    @GeneratedValue   //  自动生成
    private Long id ;

    private String name ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
