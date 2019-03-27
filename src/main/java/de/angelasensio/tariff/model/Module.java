package de.angelasensio.tariff.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Module {

    private int coverage;
    private ModuleType type;

}