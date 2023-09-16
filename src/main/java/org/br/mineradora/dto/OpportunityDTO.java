package org.br.mineradora.dto;

import java.math.BigDecimal;

public record OpportunityDTO(long proposalId, String customer, BigDecimal priceTonne, BigDecimal lastDollarQuotation) {}