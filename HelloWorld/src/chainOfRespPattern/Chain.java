package chainOfRespPattern;

public interface Chain {
	void calculate(Number request);
	void setNextChain(Chain nextChain);
}
