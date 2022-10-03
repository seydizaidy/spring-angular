package com.zaidybp.dao;

import com.zaidybp.entiities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduitRepository  extends JpaRepository<Produit,Long>
{
}
