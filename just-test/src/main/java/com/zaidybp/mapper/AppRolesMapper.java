package com.zaidybp.mapper;

import com.zaidybp.dto.ProduitDto;
import com.zaidybp.entiities.Produit;

@Mapper
public interface AppRolesMapper
{
    Produit toProduit(ProduitDto produitDto);
    ProduitDto fromProduit(Produit produit);
}
