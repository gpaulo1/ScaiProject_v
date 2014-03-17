package net.com.scaiprojectv.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTurma is a Querydsl query type for Turma
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTurma extends EntityPathBase<Turma> {

    private static final long serialVersionUID = -513590971L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTurma turma = new QTurma("turma");

    public final QFuncionario docente;

    public final ListPath<HorarioDiaAula, QHorarioDiaAula> horariosAulas = this.<HorarioDiaAula, QHorarioDiaAula>createList("horariosAulas", HorarioDiaAula.class, QHorarioDiaAula.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMateria materia;

    public final StringPath nomeTurma = createString("nomeTurma");

    public final DatePath<java.util.Date> previsaoInicio = createDate("previsaoInicio", java.util.Date.class);

    public final DatePath<java.util.Date> previsaoTermino = createDate("previsaoTermino", java.util.Date.class);

    public final NumberPath<Integer> vagasDisponiveis = createNumber("vagasDisponiveis", Integer.class);

    public final NumberPath<Double> valorCurso = createNumber("valorCurso", Double.class);

    public QTurma(String variable) {
        this(Turma.class,  forVariable(variable), INITS);
    }

    public QTurma(Path<? extends Turma> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTurma(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTurma(PathMetadata<?> metadata, PathInits inits) {
        this(Turma.class,  metadata, inits);
    }

    public QTurma(Class<? extends Turma> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.docente = inits.isInitialized("docente") ? new QFuncionario(forProperty("docente"), inits.get("docente")) : null;
        this.materia = inits.isInitialized("materia") ? new QMateria(forProperty("materia")) : null;
    }

}

