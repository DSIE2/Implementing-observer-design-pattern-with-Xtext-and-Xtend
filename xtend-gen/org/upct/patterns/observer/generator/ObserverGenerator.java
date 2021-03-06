/**
 * generated by Xtext 2.12.0
 */
package org.upct.patterns.observer.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.upct.patterns.observer.observer.Observer;
import org.upct.patterns.observer.observer.Subject;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ObserverGenerator extends AbstractGenerator {
  private final String PACKAGE_NAME = "observer";
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile((this.PACKAGE_NAME + "/ISubject.java"), this.compileISubject());
    fsa.generateFile((this.PACKAGE_NAME + "/IObserver.java"), this.compileIObserver());
    Iterable<Subject> _filter = Iterables.<Subject>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Subject.class);
    for (final Subject e : _filter) {
      String _firstUpper = StringExtensions.toFirstUpper(e.getSubject().getName());
      String _plus = ((this.PACKAGE_NAME + "/") + _firstUpper);
      String _plus_1 = (_plus + ".java");
      fsa.generateFile(_plus_1, this.compile(e));
    }
    Iterable<Observer> _filter_1 = Iterables.<Observer>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Observer.class);
    for (final Observer e_1 : _filter_1) {
      String _firstUpper_1 = StringExtensions.toFirstUpper(e_1.getObserver().getName());
      String _plus_2 = ((this.PACKAGE_NAME + "/") + _firstUpper_1);
      String _plus_3 = (_plus_2 + ".java");
      fsa.generateFile(_plus_3, this.compile(e_1));
    }
  }
  
  public CharSequence compileISubject() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.PACKAGE_NAME);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface ISubject {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void register(IObserver o);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void unregister(IObserver o);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void notifyObservers();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileIObserver() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.PACKAGE_NAME);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface IObserver {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void update(Object o);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Subject s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.PACKAGE_NAME);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(s.getSubject().getName());
    _builder.append(_firstUpper);
    _builder.append(" implements ISubject {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ArrayList<IObserver> observers = new ArrayList<IObserver>();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void register(IObserver o) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.observers.add(o);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void unregister(IObserver o) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("int index = this.observers.indexOf(o);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (index > -1) this.observers.remove(index);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void notifyObservers() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (IObserver o : this.observers) o.update(this);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int observers() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.observers.size();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Observer o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.PACKAGE_NAME);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(o.getObserver().getName());
    _builder.append(_firstUpper);
    _builder.append(" implements IObserver {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public void update(Object o) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
