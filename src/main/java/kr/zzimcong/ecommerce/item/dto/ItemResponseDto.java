package kr.zzimcong.ecommerce.item.dto;

import kr.zzimcong.ecommerce.item.domain.Item;
import lombok.Getter;

@Getter
public class ItemResponseDto {
    private Long id;
    private String name;
    private String brandName;
    private int price;
    private Integer discountRate;
    private Integer discountPrice;

    public ItemResponseDto(Long id, String name, String brandName, int price, Integer discountRate, Integer discountPrice){
        this.id = id;
        this.name = name;
        this.brandName = brandName;
        this.price = price;
        this.discountRate = discountRate;
        this.discountPrice = discountPrice;
    }

    /** Brand Fetch Join 필요 */
    public ItemResponseDto(Item item){
        this.id = item.getId();
        this.name = item.getName();
        this.brandName = item.getBrand().getName();
        this.price = item.getPrice();
        this.discountRate = item.getDiscountPrice();
        this.discountPrice = item.getDiscountPrice();
    }
}
