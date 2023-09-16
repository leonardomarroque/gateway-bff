package org.br.mineradora.dto;

import java.math.BigDecimal;

public record ProposalDetailsDTO(long proposalId, String customer, BigDecimal priceTonne, Integer tonnes, String country, Integer proposalValidityDays) {}