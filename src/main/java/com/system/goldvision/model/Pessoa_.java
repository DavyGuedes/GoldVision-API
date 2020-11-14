package com.system.goldvision.model.metamodel;

import com.system.goldvision.model.Contato;
import com.system.goldvision.model.Endereco;
import com.system.goldvision.model.Pessoa;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pessoa.class)
public abstract class Pessoa_ {

    public static final String CODIGO = "codigo";
    public static final String ATIVO = "ativo";
    public static final String ENDERECO = "endereco";
    public static final String CONTATOS = "contatos";
    public static final String NOME = "nome";
    public static volatile SingularAttribute<Pessoa, Long> codigo;
    public static volatile SingularAttribute<Pessoa, Boolean> ativo;
    public static volatile SingularAttribute<Pessoa, Endereco> endereco;
    public static volatile ListAttribute<Pessoa, Contato> contatos;
    public static volatile SingularAttribute<Pessoa, String> nome;

}

