package cloud.demo.pojo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VO of Commodity details
 *
 * @author Haifeng.Zhu
 * created at 2/26/19
 */
public class CommodityDetailVO {
    
    @JsonProperty("id")
    private Long id;
    
    @JsonProperty("name")
    private String name;

    public CommodityDetailVO() {
    }

    public CommodityDetailVO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

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
