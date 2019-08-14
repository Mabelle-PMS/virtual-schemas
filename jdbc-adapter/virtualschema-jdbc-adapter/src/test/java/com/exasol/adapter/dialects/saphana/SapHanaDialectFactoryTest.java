package com.exasol.adapter.dialects.saphana;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.exasol.adapter.AdapterProperties;

public class SapHanaDialectFactoryTest {
    private SapHanaSqlDialectFactory factory;

    @BeforeEach
    void beforeEach() {
        this.factory = new SapHanaSqlDialectFactory();
    }

    @Test
    void testGetName() {
        assertThat(this.factory.getSqlDialectName(), equalTo("SAPHANA"));
    }

    @Test
    void testCreateDialect() {
        assertThat(this.factory.createSqlDialect(null, AdapterProperties.emptyProperties()),
                instanceOf(SapHanaSqlDialect.class));
    }
}