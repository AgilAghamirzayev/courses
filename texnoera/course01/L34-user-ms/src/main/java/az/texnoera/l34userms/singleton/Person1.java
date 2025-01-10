package az.texnoera.l34userms.singleton;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class Person1 {

   String name;
   String lastName;
   Integer age;
   String email;

}
