package dlnu.liujiang.zshop.pojo;

import java.io.Serializable;

/**
 * @Auther: liujiang
 * @Date: 2019/5/12 0012
 * Description: dlnu.liujiang.zshop.pojo
 * @version: 1.0
 */
public class Product implements Serializable {

    private Integer  id;
    private String name;
    private Double price;
    private  String info;
    private String image;
    private ProductType productType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nme='" + name + '\'' +
                ", price=" + price +
                ", info='" + info + '\'' +
                ", image='" + image + '\'' +
                ", productType=" + productType +
                '}';
    }
}
