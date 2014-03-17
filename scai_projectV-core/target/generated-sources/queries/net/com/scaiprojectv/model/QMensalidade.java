package net.com.scaiprojectv.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMensalidade is a Querydsl query type for Mensalidade
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMensalidade extends EntityPathBase<Mensalidade> {

    private static final long serialVersionUID = 369214015L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMensalidade mensalidade = new QMensalidade("mensalidade");

    public final DatePath<java.util.Date> dataVencimento = createDate("dataVencimento", java.util.Date.class);

    public final QFuncionario funcionario;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath obersacao = createString("obersacao");

    public final QPagamento pagamento;

    public final NumberPath<Double> valorPago = createNumber("valorPago", Double.class);

    public QMensalidade(String variable) {
        this(Mensalidade.class,  forVariable(variable), INITS);
    }

    public QMensalidade(Path<? extends Mensalidade> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMensalidade(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMensalidade(PathMetadata<?> metadata, PathInits inits) {
        this(Mensalidade.class,  metadata, inits);
    }

    public QMensalidade(Class<? extends Mensalidade> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.funcionario = inits.isInitialized("funcionario") ? new QFuncionario(forProperty("funcionario"), inits.get("funcionario")) : null;
        this.pagamento = inits.isInitialized("pagamento") ? new QPagamento(forProperty("pagamento")) : null;
    }

}

