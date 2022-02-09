package a16_Lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgaConstructor
@AllArgsConstructor
@Data
public class Product {
	private int product_code;
	private String product_name;
	private String product_category;
	private String product_date;

}
