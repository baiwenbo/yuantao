package cn.vo.pojo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author <a href="wenbo.bai@vtradex.net">柏文博</a>
 * @since 2019-01-18 14:05
 */
@Entity
@Table(name="topic")
public class Topic {

    @Id   // 表明id
    @GeneratedValue   //  自动生成
    private Long id ;

    private String top ;

    private String issue ;

    private String description ;

    private String explain ;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
