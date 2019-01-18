package cn.vo.pojo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author <a href="wenbo.bai@vtradex.net">柏文博</a>
 * @since 2019-01-18 16:58
 */
@Entity
@Table(name="ITEM_CONTENT")
public class ItemContent {

    @Id   // 表明id
    @GeneratedValue   //  自动生成
    private Long id ;

    private String topName ;

    private String issueName ;

    private String description ;

    private String explainName ;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopName() {
        return topName;
    }

    public void setTopName(String topName) {
        this.topName = topName;
    }

    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExplainName() {
        return explainName;
    }

    public void setExplainName(String explainName) {
        this.explainName = explainName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
