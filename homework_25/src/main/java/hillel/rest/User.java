package hillel.rest;

import lombok.*;


@Data
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private String name;
    private String job;
    private String id;
    private String createdAt;
}
