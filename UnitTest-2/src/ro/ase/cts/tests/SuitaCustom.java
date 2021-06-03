package ro.ase.cts.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.tests.categorii.GetPromovabilitateCategory;
import ro.ase.cts.tests.categorii.TesteUrgenteCategory;

@RunWith(Categories.class)
@Suite.SuiteClasses({
        TesteGrupaMock.class,
        GrupaTest.class,
        GrupaTestFixture.class
})
@Categories.IncludeCategory(GetPromovabilitateCategory.class)
@Categories.ExcludeCategory(TesteUrgenteCategory.class)
public class SuitaCustom {
}
