package shop2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
//@AllArgsConstructor //이거 만들면 기본생성자 안만들어짐 -> NoArgsConstructor 만들어줘야함
//@Data //getter,setter,equals,canEqual,hashCod,toString,기본생성자

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class ProductDTO {
    private int product_id ;
    private String pname;
    private int price;
    private String content;
    
    

	
}
