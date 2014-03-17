package net.com.scaiprojectv.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMatricula is a Querydsl query type for Matricula
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMatricula extends EntityPathBase<Matricula> {

    private static final long serialVersionUID = -429344930L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMatricula matricula = new QMatricula("matricula");

    public final DateTimePath<java.util.Date> dataMatricula = createDateTime("dataMatricula", java.util.Date.class);

    public final QFuncionario funcionario;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Materia, QMateria> materias = this.<Materia, QMateria>createList("materias", Materia.class, QMateria.class, PathInits.DIRECT2);

    public final NumberPath<Integer> numeroMatricula = createNumber("numeroMatricula", Integer.class);

    public QMatricula(String variable) {
        this(Matricula.class,  forVariable(variable), INITS);
    }

    public QMatricula(Path<? extends Matricula> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMatricula(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMatricula(PathMetadata<?> metadata, PathInits inits) {
        this(Matricula.class,  metadata, inits);
    }

    public QMatricula(Class<? extends Matricula> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.funcionario = inits.isInitialized("funcionario") ? new QFuncionario(forProperty("funcionario"), inits.get("funcionario")) : null;
    }

}

