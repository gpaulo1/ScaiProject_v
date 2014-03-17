package net.com.scaiprojectv.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QAluno is a Querydsl query type for Aluno
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAluno extends EntityPathBase<Aluno> {

    private static final long serialVersionUID = -531403061L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAluno aluno = new QAluno("aluno");

    public final QPessoa _super;

    //inherited
    public final StringPath cpf;

    //inherited
    public final DatePath<java.util.Date> dataNascimento;

    //inherited
    public final StringPath ddd;

    public final NumberPath<Short> diaVencimentoMensalidade = createNumber("diaVencimentoMensalidade", Short.class);

    // inherited
    public final QEstado estado;

    //inherited
    public final NumberPath<Long> id;

    public final QMatricula matricula;

    //inherited
    public final StringPath nome;

    public final StringPath nomeResponsavel = createString("nomeResponsavel");

    //inherited
    public final StringPath rg;

    public final StringPath rgResponsavel = createString("rgResponsavel");

    //inherited
    public final ComparablePath<Character> sexo;

    //inherited
    public final StringPath sobrenome;

    //inherited
    public final StringPath telefone;

    public QAluno(String variable) {
        this(Aluno.class,  forVariable(variable), INITS);
    }

    public QAluno(Path<? extends Aluno> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAluno(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAluno(PathMetadata<?> metadata, PathInits inits) {
        this(Aluno.class,  metadata, inits);
    }

    public QAluno(Class<? extends Aluno> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QPessoa(type, metadata, inits);
        this.cpf = _super.cpf;
        this.dataNascimento = _super.dataNascimento;
        this.ddd = _super.ddd;
        this.estado = _super.estado;
        this.id = _super.id;
        this.matricula = inits.isInitialized("matricula") ? new QMatricula(forProperty("matricula"), inits.get("matricula")) : null;
        this.nome = _super.nome;
        this.rg = _super.rg;
        this.sexo = _super.sexo;
        this.sobrenome = _super.sobrenome;
        this.telefone = _super.telefone;
    }

}

