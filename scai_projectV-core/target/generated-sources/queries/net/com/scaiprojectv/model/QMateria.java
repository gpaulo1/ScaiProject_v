package net.com.scaiprojectv.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMateria is a Querydsl query type for Materia
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMateria extends EntityPathBase<Materia> {

    private static final long serialVersionUID = -2128197179L;

    public static final QMateria materia = new QMateria("materia");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Matricula, QMatricula> matriculas = this.<Matricula, QMatricula>createList("matriculas", Matricula.class, QMatricula.class, PathInits.DIRECT2);

    public final StringPath nome = createString("nome");

    public QMateria(String variable) {
        super(Materia.class,  forVariable(variable));
    }

    public QMateria(Path<? extends Materia> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMateria(PathMetadata<?> metadata) {
        super(Materia.class,  metadata);
    }

}

