package net.com.scaiprojectv.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCidade is a Querydsl query type for Cidade
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCidade extends EntityPathBase<Cidade> {

    private static final long serialVersionUID = 760342852L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCidade cidade = new QCidade("cidade");

    public final QEstado estado;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public QCidade(String variable) {
        this(Cidade.class,  forVariable(variable), INITS);
    }

    public QCidade(Path<? extends Cidade> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCidade(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCidade(PathMetadata<?> metadata, PathInits inits) {
        this(Cidade.class,  metadata, inits);
    }

    public QCidade(Class<? extends Cidade> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.estado = inits.isInitialized("estado") ? new QEstado(forProperty("estado")) : null;
    }

}

