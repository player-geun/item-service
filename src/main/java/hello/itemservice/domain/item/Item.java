package hello.itemservice.domain.item;

import lombok.Data;

@Data // 함부러 쓰면 큰일남, 필요한거 따로 꺼내쓰는게 안전함
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {

    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
