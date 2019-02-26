package cloud.demo.pojo.vo;

/**
 * Order Detail VO
 *
 * @author Haifeng.Zhu
 * created at 2/26/19
 */
public class OrderDetailVO {
    
    private Long id;
    private String name;
    private CommodityDetailVO commodityDetail;

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

    public CommodityDetailVO getCommodityDetail() {
        return commodityDetail;
    }

    public void setCommodityDetail(CommodityDetailVO commodityDetail) {
        this.commodityDetail = commodityDetail;
    }
}
