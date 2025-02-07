package br.com.myproject.tdd.classes.models;

import java.math.BigDecimal;

public enum Performance {
    GOOD {
        @Override
        public BigDecimal adjustmentPercentage() {
            return new BigDecimal("0.15");
        }
    }, EXCELLENT {
        @Override
        public BigDecimal adjustmentPercentage() {
            return new BigDecimal("0.2");
        }
    }, UNSATISFACTORY {
        @Override
        public BigDecimal adjustmentPercentage() {
            return new BigDecimal("0.03");
        }
    };

    public abstract BigDecimal adjustmentPercentage();
}
