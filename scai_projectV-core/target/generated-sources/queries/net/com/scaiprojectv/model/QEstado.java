package net.com.scaiprojectv.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QEstado is a Querydsl query type for Estado
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QEstado extends EntityPathBase<Estado> {

    private static final long serialVersionUID = 827313030L;

    public static final QEstado estado = new QEstado("estado");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public QEstado(String variable) {
        super(Estado.class,  forVariable(variable));
    }

    public QEstado(Path<? extends Estado> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEstado(PathMetadata<?> metadata) {
        super(Estado.class,  metadata);
    }

}

