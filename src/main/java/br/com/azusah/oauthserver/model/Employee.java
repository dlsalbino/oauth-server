package br.com.azusah.oauthserver.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Employee {

    private String id;
    private String name;

}
