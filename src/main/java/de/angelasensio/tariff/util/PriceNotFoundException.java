package de.angelasensio.tariff.util;

import static java.lang.String.format;

import java.util.UUID;

public class PriceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -8151638864925081315L;

    public PriceNotFoundException(final UUID uuid) {
        super(format("Could not find price for policyId: %s", uuid));
    }
}
