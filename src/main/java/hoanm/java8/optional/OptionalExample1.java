package hoanm.java8.optional;

import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
        String str = "String";
        String str1 = null;

        //static <T> Optional<T> of(T value): Trả về đối tượng Optional kiểu T chứa giá trị của value.
        Optional<String> optionalString1 = Optional.of(str);
        //static <T> Optional<T> ofNullable(T value):Trả về một Optional chứa giá trị được truyền vào nếu khác null, ngược lại sẽ trả về một Optional rỗng.
        Optional<String> optionalString2 = Optional.ofNullable(str1);
        //static <T> Optional<T> empty(): Trả về một Optional instance rỗng.
        Optional<String> optionalString3 = Optional.empty();

        //boolean isPresent() : Phương thức này được sử dụng để kiểm tra xem trong đối tượng Optional có đang chứa giá trị hay không. Giá trị trả về là True nếu có giá trị và ngược lại trả về false.
        if (optionalString1.isPresent()) {
            //T get() : Nếu như có giá trị trong Optional này, nó sẽ trả về giá trị đó, ngược lại sẽ ném ra NoSuchElementException nếu như đối tượng rỗng.
            System.out.println(optionalString1.get());
        }
        //void ifPresent(Consumer<? super T> consumer) : Nếu như đối tượng Optional đang chứa giá trị, nó sẽ áp dụng consumer được truyền vào cho giá trị của nó. Ngược lại thì không làm gì cả.
        optionalString1.ifPresent(System.out::println);
    }
}
