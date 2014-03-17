package net.com.scaiprojectv.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QHorarioDiaAula is a Querydsl query type for HorarioDiaAula
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QHorarioDiaAula extends EntityPathBase<HorarioDiaAula> {

    private static final long serialVersionUID = -517490909L;

    public static final QHorarioDiaAula horarioDiaAula = new QHorarioDiaAula("horarioDiaAula");

    public final NumberPath<Short> diaSemana = createNumber("diaSemana", Short.class);

    public final TimePath<java.util.Date> horarioInicio = createTime("horarioInicio", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Turma, QTurma> turmas = this.<Turma, QTurma>createList("turmas", Turma.class, QTurma.class, PathInits.DIRECT2);

    public QHorarioDiaAula(String variable) {
        super(HorarioDiaAula.class,  forVariable(variable));
    }

    public QHorarioDiaAula(Path<? extends HorarioDiaAula> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHorarioDiaAula(PathMetadata<?> metadata) {
        super(HorarioDiaAula.class,  metadata);
    }

}

