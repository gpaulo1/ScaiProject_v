package net.com.scaiprojectv.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QPessoa is a Querydsl query type for Pessoa
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPessoa extends EntityPathBase<Pessoa> {

    private static final long serialVersionUID = 1129292231L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPessoa pessoa = new QPessoa("pessoa");

    public final StringPath cpf = createString("cpf");

    public final DatePath<java.util.Date> dataNascimento = createDate("dataNascimento", java.util.Date.class);

    public final StringPath ddd = createString("ddd");

    public final QEstado estado;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public final StringPath rg = createString("rg");

    public final ComparablePath<Character> sexo = createComparable("sexo", Character.class);

    public final StringPath sobrenome = createString("sobrenome");

    public final StringPath telefone = createString("telefone");

    public QPessoa(String variable) {
        this(Pessoa.class,  forVariable(variable), INITS);
    }

    public QPessoa(Path<? extends Pessoa> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPessoa(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPessoa(PathMetadata<?> metadata, PathInits inits) {
        this(Pessoa.class,  metadata, inits);
    }

    public QPessoa(Class<? extends Pessoa> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.estado = inits.isInitialized("estado") ? new QEstado(forProperty("estado")) : null;
    }

}

